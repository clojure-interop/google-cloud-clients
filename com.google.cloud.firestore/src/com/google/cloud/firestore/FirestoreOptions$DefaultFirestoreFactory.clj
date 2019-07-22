(ns com.google.cloud.firestore.FirestoreOptions$DefaultFirestoreFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore FirestoreOptions$DefaultFirestoreFactory]))

(defn ->default-firestore-factory
  "Constructor."
  (^FirestoreOptions$DefaultFirestoreFactory []
    (new FirestoreOptions$DefaultFirestoreFactory )))

(defn create
  "options - `com.google.cloud.firestore.FirestoreOptions`

  returns: `com.google.cloud.firestore.Firestore`"
  (^com.google.cloud.firestore.Firestore [^FirestoreOptions$DefaultFirestoreFactory this ^com.google.cloud.firestore.FirestoreOptions options]
    (-> this (.create options))))

