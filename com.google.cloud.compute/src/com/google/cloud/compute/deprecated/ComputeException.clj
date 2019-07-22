(ns com.google.cloud.compute.deprecated.ComputeException
  "Compute Engine service exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated ComputeException]))

(defn ->compute-exception
  "Constructor.

  exception - `java.io.IOException`"
  (^ComputeException [^java.io.IOException exception]
    (new ComputeException exception)))

