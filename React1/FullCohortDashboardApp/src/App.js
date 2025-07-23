import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohorts = [
    {
      name: "Full Stack Cohort",
      batch: "B123",
      status: "ongoing",
      startDate: "2025-06-01",
      endDate: "2025-08-30"
    },
    {
      name: "Data Science Cohort",
      batch: "B124",
      status: "completed",
      startDate: "2025-01-10",
      endDate: "2025-03-20"
    }
  ];

  return (
    <div>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
