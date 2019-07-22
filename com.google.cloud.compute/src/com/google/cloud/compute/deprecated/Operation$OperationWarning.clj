(ns com.google.cloud.compute.deprecated.Operation$OperationWarning
  "A warning message that is generated during the processing of a Google Compute Engine operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Operation$OperationWarning]))

(defn get-code
  "Returns a warning identifier for this warning. For example, NO_RESULTS_ON_PAGE if
   there are no results in the response.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$OperationWarning this]
    (-> this (.getCode))))

(defn get-message
  "Returns a human-readable error message.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation$OperationWarning this]
    (-> this (.getMessage))))

(defn get-metadata
  "Returns metadata about this warning. Each key provides more detail on the warning being
   returned. For example, for warnings where there are no results in a list request for a
   particular zone, this key might be scope and the key's value might be the zone name.
   Other examples might be a key indicating a deprecated resource, and a suggested replacement,
   or a warning about invalid network settings (for example, if an instance attempts to perform
   IP forwarding but is not enabled for IP forwarding).

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^Operation$OperationWarning this]
    (-> this (.getMetadata))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Operation$OperationWarning this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Operation$OperationWarning this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Operation$OperationWarning this]
    (-> this (.hashCode))))

