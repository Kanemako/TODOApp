package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IndexServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<HTML>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>TODOアプリ出力画面</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>TODOアプリケーション</h1>");
		out.println("<h2>兼松誠のTODOリスト</h2>");
		out.println("<table border=\"1\">");
		out.println("<tr>");
		out.println("<th>No.</th>");
		out.println("<th>重要度</th>");
		out.println("<th>内容</th>");
		out.println("<th>期日</th>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>1</th>");
		String[] todoList = { "Linuxテスト対策", "paiza", "TODOアプリ作成", "履歴書" };
		int index = (int) (Math.random() * 4);
		String content = todoList[index];
		out.println("<th>" + (index + 1) + "</th>");
		out.println("<th>" + content + "</th>");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
		String today = sdf.format(date);
		out.println("<th>" + today + "</th>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");

	}

}
