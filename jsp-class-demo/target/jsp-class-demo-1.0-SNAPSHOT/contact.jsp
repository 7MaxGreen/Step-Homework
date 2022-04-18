<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        <%@ include file="style/contact.css" %>
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

        <button class="btn btn-dark" type="submit" style="margin-left: 700px; width: 69px; border:1px solid white">Send</button>
        <br>
        <br>
        <a style="margin-left: 700px; border: 1px solid black" class="btn btn-light" href="${pageContext.request.contextPath}/">Home</a>

    </form>
</div>

<div class="container ml-3" >
    <h1>Come see us</h1>

    <h4 style="margin-top: 83px">799 EmployeeStreet</h4>
    <h4>New Virginia Avenue TW390 P</h4>
    <h3>We're thrilled to hear from you</h3>
    <hr>
    <hr>
    <hr>
    <hr>
    <hr>
    <hr>


    <div class="gallery-team">
        <div class="gallery-team-item">

            <img src="./img/ceo.jpg" alt="ceo"/>
            <div class="gallery-team-title">

                <h5>Richard Guillermo</h5>
                <p> CEO</p>
                <small>(483) 89 - 2 - 398</small>
            </div>
        </div>
        <div class="gallery-team-item">

            <img src="./img/naomi.jpg" alt="ceo"/>
            <div class="gallery-team-title">

                <h5>Naomi Watts</h5>
                <p> Client Service Director</p>
                <small>(483) 89 - 2 - 398</small>
            </div>
        </div>
        <div class="gallery-team-item">

            <img src="./img/benicio.jpg" alt="ceo"/>
            <div class="gallery-team-title">

                <h5>Benicio DelToro</h5>
                <p> Client Service Director</p>
                <small>(483) 89 - 2 - 398</small>
            </div>
        </div>

    </div>
</div>
</body>
</html>
