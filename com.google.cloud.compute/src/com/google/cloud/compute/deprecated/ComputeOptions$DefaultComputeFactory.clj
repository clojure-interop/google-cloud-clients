(ns com.google.cloud.compute.deprecated.ComputeOptions$DefaultComputeFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated ComputeOptions$DefaultComputeFactory]))

(defn ->default-compute-factory
  "Constructor."
  (^ComputeOptions$DefaultComputeFactory []
    (new ComputeOptions$DefaultComputeFactory )))

(defn create
  "options - `com.google.cloud.compute.deprecated.ComputeOptions`

  returns: `com.google.cloud.compute.deprecated.Compute`"
  (^com.google.cloud.compute.deprecated.Compute [^ComputeOptions$DefaultComputeFactory this ^com.google.cloud.compute.deprecated.ComputeOptions options]
    (-> this (.create options))))

