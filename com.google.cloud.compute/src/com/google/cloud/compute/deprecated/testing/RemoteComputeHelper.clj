(ns com.google.cloud.compute.deprecated.testing.RemoteComputeHelper
  "Utility to create a remote Compute configuration for testing. Compute options can be obtained via
  the getOptions() method. Returned options have custom ServiceOptions.getRetrySettings(): RetrySettings.getMaxAttempts() is 10, RetrySettings.getMaxAttempts() ()} is 6, RetrySettings.getMaxRetryDelay() is
  30000, RetrySettings.getTotalTimeout() is 120000 and RetrySettings.getInitialRetryDelay() is 250. HttpTransportOptions.getConnectTimeout() and HttpTransportOptions.getReadTimeout() are
  both set to 60000."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated.testing RemoteComputeHelper]))

(defn *base-resource-name
  "Returns a base name for testing resources generated using a random UUID. This base name can be
   prepended to resource names to prevent name clashes. This method always returns a 30 characters
   long prefix. Since Compute Engine resource names can be at most 63 characters long your suffix
   should be no longer than 33 characters.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RemoteComputeHelper/baseResourceName )))

(defn *create
  "Creates a RemoteComputeHelper object for the given project id and JSON key input
   stream.

  project-id - id of the project to be used for running the tests - `java.lang.String`
  key-stream - input stream for a JSON key - `java.io.InputStream`

  returns: A RemoteComputeHelper object for the provided options - `com.google.cloud.compute.deprecated.testing.RemoteComputeHelper`

  throws: com.google.cloud.compute.deprecated.testing.RemoteComputeHelper$ComputeHelperException - if keyStream is not a valid JSON key stream"
  (^com.google.cloud.compute.deprecated.testing.RemoteComputeHelper [^java.lang.String project-id ^java.io.InputStream key-stream]
    (RemoteComputeHelper/create project-id key-stream))
  (^com.google.cloud.compute.deprecated.testing.RemoteComputeHelper []
    (RemoteComputeHelper/create )))

(defn get-options
  "Returns a ComputeOptions object to be used for testing.

  returns: `com.google.cloud.compute.deprecated.ComputeOptions`"
  (^com.google.cloud.compute.deprecated.ComputeOptions [^RemoteComputeHelper this]
    (-> this (.getOptions))))

