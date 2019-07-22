(ns com.google.cloud.compute.deprecated.testing.RemoteComputeHelper$ComputeHelperException
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated.testing RemoteComputeHelper$ComputeHelperException]))

(defn ->compute-helper-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^RemoteComputeHelper$ComputeHelperException [^java.lang.String message ^java.lang.Throwable cause]
    (new RemoteComputeHelper$ComputeHelperException message cause)))

(defn *translate
  "ex - `java.lang.Exception`

  returns: `com.google.cloud.compute.deprecated.testing.RemoteComputeHelper$ComputeHelperException`"
  (^com.google.cloud.compute.deprecated.testing.RemoteComputeHelper$ComputeHelperException [^java.lang.Exception ex]
    (RemoteComputeHelper$ComputeHelperException/translate ex)))

