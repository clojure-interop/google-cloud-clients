(ns com.google.cloud.firestore.collection.LLRBNode$NodeVisitor
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.collection LLRBNode$NodeVisitor]))

(defn ->node-visitor
  "Constructor."
  (^LLRBNode$NodeVisitor []
    (new LLRBNode$NodeVisitor )))

(defn should-continue?
  "key - `K`
  value - `V`

  returns: `boolean`"
  (^Boolean [^LLRBNode$NodeVisitor this key value]
    (-> this (.shouldContinue key value))))

(defn visit-entry
  "key - `K`
  value - `V`"
  ([^LLRBNode$NodeVisitor this key value]
    (-> this (.visitEntry key value))))

