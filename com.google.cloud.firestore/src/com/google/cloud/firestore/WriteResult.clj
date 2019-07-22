(ns com.google.cloud.firestore.WriteResult
  "A WriteResult exposes the update time set by the server."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore WriteResult]))

(defn get-update-time
  "The update time as exposed by the server. Can be used in Precondition.updatedAt(com.google.cloud.Timestamp).

  returns: The update time of the corresponding write. - `com.google.cloud.Timestamp`"
  (^com.google.cloud.Timestamp [^WriteResult this]
    (-> this (.getUpdateTime))))

(defn equals
  "Returns true if this WriteResult is equal to the provided object.

  obj - The object to compare against. - `java.lang.Object`

  returns: Whether this WriteResult is equal to the provided object. - `boolean`"
  (^Boolean [^WriteResult this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^WriteResult this]
    (-> this (.hashCode))))

