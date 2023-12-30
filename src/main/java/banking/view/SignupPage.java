package banking.view;

public class SignupPage {
	public static String getSigninPage() {
		return """
				<!DOCTYPE html>
				<html lang="en">

				<head>
				    <meta charset="UTF-8">
				    <meta name="viewport" content="width=device-width, initial-scale=1.0">
				    <title>Banking</title>
				</head>
							 %s
				<body>
				    <section>
				        <div class="container">
				        <h2>Sign up</h2>
				            <form action="signin"method="post">
				                <div class="form-group">
				                    <label>Enter name</label>
				                    <input type="text" name="name" requried>
				                </div>
				                <div class="form-group">
				                    <label>Enter email</label>
				                    <input type="email" name="email" requried>
				                </div>
				                <div class="form-group">
				                    <label>Enter password</label>
				                    <input type="password" name="password" requried>
				                </div>
				                <button type="submit">Submit</button>
				            </form>
				        </div>

				    </section>
				</body>

				</html>
				""".formatted(style());

	}

	private static String style() {
		return """
				<style>
				     * {
				         margin: 0;
				         box-sizing: border-box;
				         color-
				     }

				     html {
				         font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
				     }

				     body {
				         min-height: 100vh;
				         display: grid;
				         place-items: center;
				     }

				     section .container {
				         box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
				         padding: 1rem;
				         border-radius: 1rem;
				     }

				     .container h2 {
				         text-align: center;
				         text-transform: uppercase;
				     }

				     .container div{
				         margin-block: 1rem;
				     }

				     .container input {
				         width: 100%;
				         font-size: 1rem;

				     }

				     .container input:focus {
				         outline-color: rgb(106, 106, 255);
				     }

				     button {
				         color: #fff;
				         background: rgb(6, 60, 222);
				         border: none;
				         padding: .5rem;
				         cursor: .5;
				         border-radius: 1rem;
				         box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
				         transition: 0.5s;
				     }

				     button:hover {
				         background-color: rgb(0, 183, 255);

				     }
				 </style>

				""";
	}
}
