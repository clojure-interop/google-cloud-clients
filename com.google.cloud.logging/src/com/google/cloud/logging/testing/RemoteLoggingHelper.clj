(ns com.google.cloud.logging.testing.RemoteLoggingHelper
  "Utility to create a remote logging configuration for testing. Logging options can be obtained via
  the getOptions() method. Returned options have custom ServiceOptions.getRetrySettings(): RetrySettings.getMaxRetryDelay() is 30000,
  RetrySettings.getTotalTimeout() is 120000 and RetrySettings.getInitialRetryDelay() is 250."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.testing RemoteLoggingHelper]))

(defn *create
  "Creates a RemoteLoggingHelper object for the given project id and JSON key input
   stream.

  project-id - id of the project to be used for running the tests - `java.lang.String`
  key-stream - input stream for a JSON key - `java.io.InputStream`

  returns: A RemoteLoggingHelper object for the provided options - `com.google.cloud.logging.testing.RemoteLoggingHelper`

  throws: com.google.cloud.logging.testing.RemoteLoggingHelper$LoggingHelperException - if keyStream is not a valid JSON key stream"
  (^com.google.cloud.logging.testing.RemoteLoggingHelper [^java.lang.String project-id ^java.io.InputStream key-stream]
    (RemoteLoggingHelper/create project-id key-stream))
  (^com.google.cloud.logging.testing.RemoteLoggingHelper []
    (RemoteLoggingHelper/create )))

(defn *format-for-test
  "Formats a resource name for testing purpose. This method appends a random UUID to the provided
   name.

  name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String name]
    (RemoteLoggingHelper/formatForTest name)))

(defn get-options
  "Returns a LoggingOptions object to be used for testing.

  returns: `com.google.cloud.logging.LoggingOptions`"
  (^com.google.cloud.logging.LoggingOptions [^RemoteLoggingHelper this]
    (-> this (.getOptions))))

