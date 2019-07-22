(ns com.google.cloud.firestore.FirestoreOptions$DefaultFirestoreRpcFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore FirestoreOptions$DefaultFirestoreRpcFactory]))

(defn ->default-firestore-rpc-factory
  "Constructor."
  (^FirestoreOptions$DefaultFirestoreRpcFactory []
    (new FirestoreOptions$DefaultFirestoreRpcFactory )))

(defn create
  "options - `com.google.cloud.firestore.FirestoreOptions`

  returns: `com.google.cloud.firestore.spi.v1.FirestoreRpc`"
  (^com.google.cloud.firestore.spi.v1.FirestoreRpc [^FirestoreOptions$DefaultFirestoreRpcFactory this ^com.google.cloud.firestore.FirestoreOptions options]
    (-> this (.create options))))

