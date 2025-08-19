document.getElementById("employeeForm").addEventListener("submit", function(event) {
  event.preventDefault(); 

  const empId = document.getElementById("empId").value;
  const empName = document.getElementById("empName").value;
  const email = document.getElementById("email").value;
  const dob = document.getElementById("dob").value;
  const address = document.getElementById("address").value;
  const mobile = document.getElementById("mobile").value;

    console.log("Employee ID:", empId);
    console.log("Employee Name:", empName);
    console.log("Email:", email);
    console.log("DOB:", dob);
    console.log("Address:", address);
    console.log("Mobile No:", mobile);

  alert("Form Submitted Successfully."
    // `Retrieved Data:\n
    // Employee ID: ${empId}\n
    // Employee Name: ${empName}\n
    // Email: ${email}\n
    // DOB: ${dob}\n
    // Address: ${address}\n
    // Mobile: ${mobile}`
  );
});
