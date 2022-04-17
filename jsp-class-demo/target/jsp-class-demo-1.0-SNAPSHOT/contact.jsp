<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        body {
            background-image: url("https://images.pexels.com/photos/1069798/pexels-photo-1069798.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
            background-repeat: no-repeat;
            background-size: cover;
            background-position: center;
            display: flex;
        }

        .container{
            max-width: 1200px;
            margin: 0 auto;
            margin-top: 20px;
        }



        h1{
            color: white;
        }

        label, p, h3{
            color: white;
        }

        textarea{
            margin-top: -15px;
            resize: none;
            width: 100%;
            height: 165px;
            background-color: white;
            border: 2px solid  #eaeef1;
            border-radius: 5px;
        }

        .gallery-team{
            display: flex;
            flex-wrap: wrap;
            color: #fff;
        }



        .gallery-team-item{
            width: calc(25% - 30px);
            margin: 15px;
            min-height: 300px;
            overflow: hidden;
            position: relative;
        }

        .gallery-team-item img{
            width: 100%;
        }

        .gallery-team-title{

            padding: 10px;
            visibility: hidden;
            background-color: #23b7a4;
            display: flex;
            text-align: left;
            flex-direction: column;
            z-index: 1;
        }

        a:hover {
            cursor: pointer;
            border: 2px solid white;
            border-radius: 5px;
            text-decoration-color: aqua;
        }


    </style>
    <title style="color: aliceblue">Contact info</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>

<div class="container">
    <h1 >|Contact info</h1>

    <form style="margin-top: 66px; margin-left: 30px">
        <div class="form-group">
            <label for="Firstname">Firstname</label>
            <input type="text" class="form-control" id="Firstname" placeholder="Firstname" size="50">
        </div>
        <div class="form-group">
            <label for="Lastname">Lastname</label>
            <input type="text" class="form-control" id="Lastname" placeholder="Lastname">
        </div>
        <div class="form-group">
            <label for="Email">Email</label>
            <input type="email" class="form-control" id="Email" placeholder="Email">
        </div>
        <div class="form-group">
            <label>Message</label>
            <textarea></textarea>
        </div>
        <br>

        <button class="btn btn-dark" type="submit" style="margin-left: 700px; width: 69px; border:1px solid aqua">Send</button>
        <br>
        <br>
        <a style="margin-left: 700px; border: 1px solid black" class="btn btn-info" href="${pageContext.request.contextPath}/">Home</a>

    </form>
</div>

<div class="container ml-3" >
    <h1>Come see us</h1>

    <p style="margin-top: 83px">799 EmployeeStreet</p>
    <p>New Virginia Avenue TW390 P</p>
    <h3>We're thrilled to hear from you</h3>
    <div class="gallery-team">
        <div class="gallery-team-item">

<%--            <img src="<%@ include file="img/benicio.jpg" %>" alt="ceo"/>--%>
            <div class="gallery-team-title">

                <h5>Benicio Del Toro</h5>
                <p> Client Service Director</p>
            </div>
        </div>
    </div>
</div>
</body>
</html>
