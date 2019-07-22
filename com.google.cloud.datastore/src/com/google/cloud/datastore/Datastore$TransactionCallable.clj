(ns com.google.cloud.datastore.Datastore$TransactionCallable
  "A callback for running with a transactional DatastoreReaderWriter. The associated transaction will be committed
  after a successful return from the run method. Any propagated exception will cause the
  transaction to be rolled-back."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore Datastore$TransactionCallable]))

(defn run
  "reader-writer - `com.google.cloud.datastore.DatastoreReaderWriter`

  returns: `T`

  throws: java.lang.Exception"
  ([^Datastore$TransactionCallable this ^com.google.cloud.datastore.DatastoreReaderWriter reader-writer]
    (-> this (.run reader-writer))))

