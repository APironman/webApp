<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Registration Form</title>
</head>
<body>
  <h2>Student Registration Form</h2>
  <form action="register" method="post">
    <label for="name">Name:</label><br>
    <input type="text" id="name" name="name" placeholder="Enter Name" required><br><br>

    <label for="rollNo">Roll Number:</label><br>
    <input type="text" id="rollNo" name="rollNo" placeholder="Enter Roll No" required><br><br>

    <label for="address">Address:</label><br>
    <textarea id="address" name="address" rows="4" placeholder="Enter Address" required></textarea><br><br>

    <input type="submit" value="Register">
  </form>
</body>
</html>
