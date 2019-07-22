(ns com.google.cloud.firestore.WriteBatch
  "A Firestore WriteBatch that can be used to atomically commit multiple write operations at once."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore WriteBatch]))

(defn commit
  "Applies the current WriteBatch and returns an array with WriteResults.

  returns: ApiFuture with a List of WriteResults - `com.google.api.core.ApiFuture<java.util.List<com.google.cloud.firestore.WriteResult>>`"
  (^com.google.api.core.ApiFuture [^WriteBatch this]
    (-> this (.commit))))

