import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore() {
  const name = "Steeve";
  const school = "DNV Public School";
  const total = 284;
  const goal = "Engineer";
  const subjects = 3;

  const average = total / subjects;

  return (
    <div className="score-card">
      <h2>Student Score Calculator</h2>
      <p><strong>Name:</strong> {name}</p>
      <p><strong>School:</strong> {school}</p>
      <p><strong>Total Score:</strong> {total}</p>
      <p><strong>Average Score:</strong> {average}</p>
      <p><strong>Goal:</strong> {goal}</p>
    </div>
  );
}

export default CalculateScore;
