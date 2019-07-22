(ns com.google.cloud.compute.deprecated.ComputeOptions$DefaultComputeRpcFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated ComputeOptions$DefaultComputeRpcFactory]))

(defn ->default-compute-rpc-factory
  "Constructor."
  (^ComputeOptions$DefaultComputeRpcFactory []
    (new ComputeOptions$DefaultComputeRpcFactory )))

(defn create
  "options - `com.google.cloud.compute.deprecated.ComputeOptions`

  returns: `com.google.cloud.ServiceRpc`"
  (^com.google.cloud.ServiceRpc [^ComputeOptions$DefaultComputeRpcFactory this ^com.google.cloud.compute.deprecated.ComputeOptions options]
    (-> this (.create options))))

