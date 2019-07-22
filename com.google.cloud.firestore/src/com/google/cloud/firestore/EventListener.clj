(ns com.google.cloud.firestore.EventListener
  "An interface for event listeners."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore EventListener]))

(defn on-event
  "onEvent will be called with the new value or the error if an error occurred. It's guaranteed
   that exactly one of value or error will be non-null.

  value - The value of the event. null if there was an error. - `T`
  error - The error if there was error. null otherwise. - `com.google.cloud.firestore.FirestoreException`"
  ([^EventListener this value ^com.google.cloud.firestore.FirestoreException error]
    (-> this (.onEvent value error))))

