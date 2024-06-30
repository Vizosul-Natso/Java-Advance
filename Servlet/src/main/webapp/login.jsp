<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login page</title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        :root{
            --color1:#22f033;
            --color2:#f0f3f0;
            --color3: whitesmoke;
        }
        .login-container{
            display: flex;
            width: 99vw;
            height: 80vh;
            align-items: center;
            justify-content: center;
        }
        .login-display{
            border: 0.2px solid var(--color1);
            display: flex;
            align-items: center;
            justify-content: center;
            flex-direction: column;
            width: 34rem;
            gap: 2rem;
            background-color: var(--color2);
            border-radius: 1rem;
        }
        .head{
            display: flex;
            border:2px solid var(--color1);
            height: 1.8rem;
            width: 100%;
            background-color: var(--color1);
            border-radius: 1rem 1rem 0 0;
        }
        form{
            border: none;
            display: grid;
            grid-template-columns: 1fr 2fr;
            grid-template-rows: 1fr 1fr 1fr;
            padding: 0.8rem;
            gap: 0.8rem;
            width: 30rem;
            height: auto;
            font-size: 1.4rem;
            background-color: white;
            margin-bottom: 2rem;
        }
        input{
            padding: 0.2rem 0.2rem 0.2rem 2rem;
            font-size: 1.2rem;
            height: 2rem;
            border: 0.5px solid var(--color1);
        }
        #login-btn{
            border: none;
            font-size: 1.2rem;
            width: 6rem;
            height: auto;
            padding: 0.6rem;
            background: var(--color1);
            color: aliceblue;
            grid-column: 1 / span 2;
            margin-left: 10em;
            
        }
        #login-btn:hover{
            scale: 1.02;
            filter: brightness(105%);
        }
    </style>
</head>
<body>
    <div class="login-container">
        <div class="login-display">
            <div class="head"></div>
            <form action="test2" method="post">
                <label for="username">User Name</label>
                <input type="text" name="username" placeholder="Enter username">
                <label for="password">Password</label>
                <input type="password" name="password" id="password" placeholder="Enter Password">
                <button type="submit" id="login-btn">Login</button>
            </form>
        </div>
    </div>  
</body>
</html>