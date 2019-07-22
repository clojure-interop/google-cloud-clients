(ns com.google.cloud.firestore.collection.LLRBNode$ShortCircuitingNodeVisitor
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.collection LLRBNode$ShortCircuitingNodeVisitor]))

(defn should-continue?
  "key - `K`
  value - `V`

  returns: `boolean`"
  (^Boolean [^LLRBNode$ShortCircuitingNodeVisitor this key value]
    (-> this (.shouldContinue key value))))

