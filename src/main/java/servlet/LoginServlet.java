package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginLogic;
import model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//index.jspから入力されたユーザー名とパスワードをの値を受け取る
		String userName = request.getParameter("userName");
		String pass = request.getParameter("pass");

		//エラーチェック
		String errorMsg = "";
		if (userName == null || userName.length() <= 0) {
			errorMsg += "名前が未入力です<br>";
		}
		if (pass == null || pass.length() <= 0) {
			errorMsg += "パスワードが未入力です<br>";
		}

		if (errorMsg == null || errorMsg.length() > 0) {
			request.setAttribute("errorMsg", errorMsg);
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
			return;
		}

		//JavaBeans(User)に値を保存
		User user = new User(userName, pass);

		//ログイン判定をする
		LoginLogic loginLogic = new LoginLogic();
		boolean result = loginLogic.execute(user);

		//ログイン判定に基づき遷移先を設定
		if (result == true) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			//フォワード先に遷移
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/input.jsp");
			dispatcher.forward(request, response);
			return;
		} else {
			errorMsg = "ユーザー名又は、パスワードに誤りがあります。";
			request.setAttribute("errorMsg", errorMsg);
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}

	}
}
