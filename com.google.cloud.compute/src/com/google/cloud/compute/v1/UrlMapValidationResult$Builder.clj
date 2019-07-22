(ns com.google.cloud.compute.v1.UrlMapValidationResult$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 UrlMapValidationResult$Builder]))

(defn get-test-failures-list
  "returns: `java.util.List<com.google.cloud.compute.v1.TestFailure>`"
  (^java.util.List [^UrlMapValidationResult$Builder this]
    (-> this (.getTestFailuresList))))

(defn set-load-succeeded
  "Whether the given UrlMap can be successfully loaded. If false, 'loadErrors' indicates the
   reasons.

  load-succeeded - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.UrlMapValidationResult$Builder`"
  (^com.google.cloud.compute.v1.UrlMapValidationResult$Builder [^UrlMapValidationResult$Builder this ^java.lang.Boolean load-succeeded]
    (-> this (.setLoadSucceeded load-succeeded))))

(defn add-load-errors
  "load-errors - `java.lang.String`

  returns: `com.google.cloud.compute.v1.UrlMapValidationResult$Builder`"
  (^com.google.cloud.compute.v1.UrlMapValidationResult$Builder [^UrlMapValidationResult$Builder this ^java.lang.String load-errors]
    (-> this (.addLoadErrors load-errors))))

(defn get-load-errors-list
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^UrlMapValidationResult$Builder this]
    (-> this (.getLoadErrorsList))))

(defn add-all-test-failures
  "test-failures - `java.util.List`

  returns: `com.google.cloud.compute.v1.UrlMapValidationResult$Builder`"
  (^com.google.cloud.compute.v1.UrlMapValidationResult$Builder [^UrlMapValidationResult$Builder this ^java.util.List test-failures]
    (-> this (.addAllTestFailures test-failures))))

(defn get-test-passed?
  "If successfully loaded, this field indicates whether the test passed. If false,
   'testFailures's indicate the reason of failure.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^UrlMapValidationResult$Builder this]
    (-> this (.getTestPassed))))

(defn build
  "returns: `com.google.cloud.compute.v1.UrlMapValidationResult`"
  (^com.google.cloud.compute.v1.UrlMapValidationResult [^UrlMapValidationResult$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.UrlMapValidationResult`

  returns: `com.google.cloud.compute.v1.UrlMapValidationResult$Builder`"
  (^com.google.cloud.compute.v1.UrlMapValidationResult$Builder [^UrlMapValidationResult$Builder this ^com.google.cloud.compute.v1.UrlMapValidationResult other]
    (-> this (.mergeFrom other))))

(defn get-load-succeeded?
  "Whether the given UrlMap can be successfully loaded. If false, 'loadErrors' indicates the
   reasons.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^UrlMapValidationResult$Builder this]
    (-> this (.getLoadSucceeded))))

(defn set-test-passed
  "If successfully loaded, this field indicates whether the test passed. If false,
   'testFailures's indicate the reason of failure.

  test-passed - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.UrlMapValidationResult$Builder`"
  (^com.google.cloud.compute.v1.UrlMapValidationResult$Builder [^UrlMapValidationResult$Builder this ^java.lang.Boolean test-passed]
    (-> this (.setTestPassed test-passed))))

(defn clone
  "returns: `com.google.cloud.compute.v1.UrlMapValidationResult$Builder`"
  (^com.google.cloud.compute.v1.UrlMapValidationResult$Builder [^UrlMapValidationResult$Builder this]
    (-> this (.clone))))

(defn add-test-failures
  "test-failures - `com.google.cloud.compute.v1.TestFailure`

  returns: `com.google.cloud.compute.v1.UrlMapValidationResult$Builder`"
  (^com.google.cloud.compute.v1.UrlMapValidationResult$Builder [^UrlMapValidationResult$Builder this ^com.google.cloud.compute.v1.TestFailure test-failures]
    (-> this (.addTestFailures test-failures))))

(defn add-all-load-errors
  "load-errors - `java.util.List`

  returns: `com.google.cloud.compute.v1.UrlMapValidationResult$Builder`"
  (^com.google.cloud.compute.v1.UrlMapValidationResult$Builder [^UrlMapValidationResult$Builder this ^java.util.List load-errors]
    (-> this (.addAllLoadErrors load-errors))))

