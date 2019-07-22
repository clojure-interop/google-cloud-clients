(ns com.google.cloud.firestore.collection.LLRBRedValueNode
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.collection LLRBRedValueNode]))

(defn red?
  "returns: `boolean`"
  (^Boolean [^LLRBRedValueNode this]
    (-> this (.isRed))))

(defn size
  "returns: `int`"
  (^Integer [^LLRBRedValueNode this]
    (-> this (.size))))

