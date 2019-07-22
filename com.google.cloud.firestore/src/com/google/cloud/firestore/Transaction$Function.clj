(ns com.google.cloud.firestore.Transaction$Function
  "User callback that takes a Firestore Transaction"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore Transaction$Function]))

(defn update-callback
  "transaction - `com.google.cloud.firestore.Transaction`

  returns: `T`

  throws: java.lang.Exception"
  ([^Transaction$Function this ^com.google.cloud.firestore.Transaction transaction]
    (-> this (.updateCallback transaction))))

