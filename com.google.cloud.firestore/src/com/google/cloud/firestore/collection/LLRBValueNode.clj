(ns com.google.cloud.firestore.collection.LLRBValueNode
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.collection LLRBValueNode]))

(defn get-left
  "returns: `com.google.cloud.firestore.collection.LLRBNode<K,V>`"
  (^com.google.cloud.firestore.collection.LLRBNode [^LLRBValueNode this]
    (-> this (.getLeft))))

(defn copy
  "key - `K`
  value - `V`
  color - `com.google.cloud.firestore.collection.LLRBNode$Color`
  left - `com.google.cloud.firestore.collection.LLRBNode`
  right - `com.google.cloud.firestore.collection.LLRBNode`

  returns: `com.google.cloud.firestore.collection.LLRBValueNode<K,V>`"
  (^com.google.cloud.firestore.collection.LLRBValueNode [^LLRBValueNode this key value ^com.google.cloud.firestore.collection.LLRBNode$Color color ^com.google.cloud.firestore.collection.LLRBNode left ^com.google.cloud.firestore.collection.LLRBNode right]
    (-> this (.copy key value color left right))))

(defn get-min
  "returns: `com.google.cloud.firestore.collection.LLRBNode<K,V>`"
  (^com.google.cloud.firestore.collection.LLRBNode [^LLRBValueNode this]
    (-> this (.getMin))))

(defn get-max
  "returns: `com.google.cloud.firestore.collection.LLRBNode<K,V>`"
  (^com.google.cloud.firestore.collection.LLRBNode [^LLRBValueNode this]
    (-> this (.getMax))))

(defn get-key
  "returns: `K`"
  ([^LLRBValueNode this]
    (-> this (.getKey))))

(defn get-value
  "returns: `V`"
  ([^LLRBValueNode this]
    (-> this (.getValue))))

(defn get-right
  "returns: `com.google.cloud.firestore.collection.LLRBNode<K,V>`"
  (^com.google.cloud.firestore.collection.LLRBNode [^LLRBValueNode this]
    (-> this (.getRight))))

(defn remove
  "key - `K`
  comparator - `java.util.Comparator`

  returns: `com.google.cloud.firestore.collection.LLRBNode<K,V>`"
  (^com.google.cloud.firestore.collection.LLRBNode [^LLRBValueNode this key ^java.util.Comparator comparator]
    (-> this (.remove key comparator))))

(defn short-circuiting-reverse-order-traversal
  "visitor - `com.google.cloud.firestore.collection.LLRBNode$ShortCircuitingNodeVisitor`

  returns: `boolean`"
  (^Boolean [^LLRBValueNode this ^com.google.cloud.firestore.collection.LLRBNode$ShortCircuitingNodeVisitor visitor]
    (-> this (.shortCircuitingReverseOrderTraversal visitor))))

(defn short-circuiting-in-order-traversal
  "visitor - `com.google.cloud.firestore.collection.LLRBNode$ShortCircuitingNodeVisitor`

  returns: `boolean`"
  (^Boolean [^LLRBValueNode this ^com.google.cloud.firestore.collection.LLRBNode$ShortCircuitingNodeVisitor visitor]
    (-> this (.shortCircuitingInOrderTraversal visitor))))

(defn insert
  "key - `K`
  value - `V`
  comparator - `java.util.Comparator`

  returns: `com.google.cloud.firestore.collection.LLRBNode<K,V>`"
  (^com.google.cloud.firestore.collection.LLRBNode [^LLRBValueNode this key value ^java.util.Comparator comparator]
    (-> this (.insert key value comparator))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^LLRBValueNode this]
    (-> this (.isEmpty))))

(defn in-order-traversal
  "visitor - `com.google.cloud.firestore.collection.LLRBNode$NodeVisitor`"
  ([^LLRBValueNode this ^com.google.cloud.firestore.collection.LLRBNode$NodeVisitor visitor]
    (-> this (.inOrderTraversal visitor))))

