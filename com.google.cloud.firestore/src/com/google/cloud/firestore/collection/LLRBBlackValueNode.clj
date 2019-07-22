(ns com.google.cloud.firestore.collection.LLRBBlackValueNode
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.collection LLRBBlackValueNode]))

(defn red?
  "returns: `boolean`"
  (^Boolean [^LLRBBlackValueNode this]
    (-> this (.isRed))))

(defn size
  "returns: `int`"
  (^Integer [^LLRBBlackValueNode this]
    (-> this (.size))))

