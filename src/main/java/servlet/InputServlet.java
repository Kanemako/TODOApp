package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Todo;

/**
 * Servlet implementation class InputServlet
 */
@WebServlet("/InputServlet")
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InputServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		// リダイレクト
		response.sendRedirect("index.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		String priority = request.getParameter("priority");
		String todo = request.getParameter("todo");
		String deadline = request.getParameter("deadline");

		//リクエストパラメーターチェック
		String errorMsg = "";
		if (todo == null || todo.length() == 0) {
			errorMsg += "内容が入力されていません<br>";
			request.setAttribute("errorMsg", errorMsg);
		}
		if (deadline == null || deadline.length() == 0) {
			errorMsg += "期日が入力されていません<br>";
			request.setAttribute("errorMsg", errorMsg);

		}

		if (errorMsg != "") {
			request.setAttribute("errorMsg", errorMsg);
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/input.jsp");
			dispatcher.forward(request, response);
			return;
		}

		Todo todoJ = new Todo();
		todoJ.setPriority(priority);
		todoJ.setTodo(todo);
		todoJ.setDeadline(deadline);

		request.setAttribute("todo", todoJ);

		/*request.setAttribute("priority", priority);
		request.setAttribute("todo", todo);
		request.setAttribute("deadline", deadline);
		request.setAttribute("errorMsg", errorMsg);*/

		//フォワード

		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/list.jsp");
		dispatcher.forward(request, response);

	}
}
