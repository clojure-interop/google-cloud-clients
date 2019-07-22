(ns com.google.cloud.translate.testing.RemoteTranslateHelper
  "Utility to create a remote translate configuration for testing. Translate options can be obtained
  via the getOptions() ()} method. Returned options have custom ServiceOptions.getRetrySettings(): RetrySettings.getMaxAttempts() is 10,
  RetrySettings.getMaxRetryDelay() is 30000, RetrySettings.getTotalTimeout() is 120000 and RetrySettings.getInitialRetryDelay() is 250. HttpTransportOptions.getConnectTimeout() and HttpTransportOptions.getReadTimeout() are
  both both set to 60000."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate.testing RemoteTranslateHelper]))

(defn *create
  "Creates a RemoteTranslateHelper object for the given project id and JSON key input
   stream.

  project-id - id of the project to be used for running the tests - `java.lang.String`
  key-stream - input stream for a JSON key - `java.io.InputStream`

  returns: A RemoteTranslateHelper object for the provided options - `com.google.cloud.translate.testing.RemoteTranslateHelper`

  throws: com.google.cloud.translate.testing.RemoteTranslateHelper$TranslateHelperException - if keyStream is not a valid JSON key stream"
  (^com.google.cloud.translate.testing.RemoteTranslateHelper [^java.lang.String project-id ^java.io.InputStream key-stream]
    (RemoteTranslateHelper/create project-id key-stream))
  (^com.google.cloud.translate.testing.RemoteTranslateHelper [^java.lang.String api-key]
    (RemoteTranslateHelper/create api-key))
  (^com.google.cloud.translate.testing.RemoteTranslateHelper []
    (RemoteTranslateHelper/create )))

(defn get-options
  "Returns a TranslateOptions object to be used for testing.

  returns: `com.google.cloud.translate.TranslateOptions`"
  (^com.google.cloud.translate.TranslateOptions [^RemoteTranslateHelper this]
    (-> this (.getOptions))))

