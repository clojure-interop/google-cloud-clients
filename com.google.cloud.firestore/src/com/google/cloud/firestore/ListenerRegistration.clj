(ns com.google.cloud.firestore.ListenerRegistration
  "Represents a listener that can be removed by calling remove()."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore ListenerRegistration]))

(defn remove
  "Removes the listener being tracked by this ListenerRegistration. After the initial call,
   subsequent calls have no effect."
  ([^ListenerRegistration this]
    (-> this (.remove))))

