// src/TrainerDetails.js
import React from "react";
import { useParams } from "react-router-dom";
import trainers from "./TrainersMock";

function TrainerDetail() {
  const { id } = useParams();
  const trainer = trainers.find((t) => t.id === parseInt(id));

  if (!trainer) {
    return <p>Trainer not found</p>;
  }

  return (
    <div>
      <h2>{trainer.name}</h2>
      <p><strong>Email:</strong> {trainer.email}</p>
      <p><strong>Phone:</strong> {trainer.phone}</p>
      <p><strong>Stream:</strong> {trainer.technology}</p>
      <p><strong>Skills:</strong> {trainer.skills.join(", ")}</p>
    </div>
  );
}

export default TrainerDetail;
