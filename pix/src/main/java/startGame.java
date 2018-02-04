//パッケージ定義
package controller;

// import
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MessageBean;
import net.arnx.jsonic.JSON;

//クラス定義
@WebServlet("/startGame")
public class StartGame extends HttpServlet {

	// GETリクエスト(お題をDBから取ってきてJavaScriptに返す)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// JavaScriptからのリクエストをStringに退避する
		request.setCharacterEncoding("UTF8");
		String request = request.getParameter("request")

		// JavaScriptに値を返す
		response.setContentType("text/html; charset=UTF8");
		// 本当は、JSONとかXMLにする⇒サンプルなので許す
		response.setContentType("text/plain; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("responce");
	}

	// POSTリクエスト（GETと同じー）
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
      }
}