(ns com.google.cloud.spanner.Operation
  "Represents a long running operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Operation]))

(defn reload
  "Fetches the current status of this operation.

  returns: `com.google.cloud.spanner.Operation<R,M>`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.cloud.spanner.Operation [^Operation this]
    (-> this (.reload))))

(defn wait-for
  "Blocks till the operation is complete or maximum time, if specified, has elapsed.

  wait-options - `com.google.cloud.RetryOption`

  returns: null if operation is not found otherwise the current operation. - `com.google.cloud.spanner.Operation<R,M>`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.cloud.spanner.Operation [^Operation this ^com.google.cloud.RetryOption wait-options]
    (-> this (.waitFor wait-options))))

(defn get-metadata
  "Returns the metadata returned by the last refresh of this operation. Returns null if no
   metadata was returned or if this operation has not been refereshed.

  returns: `M`"
  ([^Operation this]
    (-> this (.getMetadata))))

(defn done?
  "Returns true if the operation is done.

  returns: `boolean`"
  (^Boolean [^Operation this]
    (-> this (.isDone))))

(defn get-result
  "Returns result of the operation if the operation is complete and had a result. Returns null if
   the operation is not complete or did not have a result.

  returns: `R`

  throws: com.google.cloud.spanner.SpannerException - if the operation failed."
  ([^Operation this]
    (-> this (.getResult))))

(defn get-name
  "Returns the name of the operation.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getName))))

(defn successful?
  "Returns true if the operation completed sucessfully.

  returns: `boolean`"
  (^Boolean [^Operation this]
    (-> this (.isSuccessful))))

