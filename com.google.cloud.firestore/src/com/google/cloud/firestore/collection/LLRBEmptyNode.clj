(ns com.google.cloud.firestore.collection.LLRBEmptyNode
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore.collection LLRBEmptyNode]))

(defn *get-instance
  "returns: `<K,V> com.google.cloud.firestore.collection.LLRBEmptyNode<K,V>`"
  ([]
    (LLRBEmptyNode/getInstance )))

(defn get-left
  "returns: `com.google.cloud.firestore.collection.LLRBNode<K,V>`"
  (^com.google.cloud.firestore.collection.LLRBNode [^LLRBEmptyNode this]
    (-> this (.getLeft))))

(defn copy
  "key - `K`
  value - `V`
  color - `com.google.cloud.firestore.collection.LLRBNode$Color`
  left - `com.google.cloud.firestore.collection.LLRBNode`
  right - `com.google.cloud.firestore.collection.LLRBNode`

  returns: `com.google.cloud.firestore.collection.LLRBNode<K,V>`"
  (^com.google.cloud.firestore.collection.LLRBNode [^LLRBEmptyNode this key value ^com.google.cloud.firestore.collection.LLRBNode$Color color ^com.google.cloud.firestore.collection.LLRBNode left ^com.google.cloud.firestore.collection.LLRBNode right]
    (-> this (.copy key value color left right))))

(defn red?
  "returns: `boolean`"
  (^Boolean [^LLRBEmptyNode this]
    (-> this (.isRed))))

(defn get-min
  "returns: `com.google.cloud.firestore.collection.LLRBNode<K,V>`"
  (^com.google.cloud.firestore.collection.LLRBNode [^LLRBEmptyNode this]
    (-> this (.getMin))))

(defn get-max
  "returns: `com.google.cloud.firestore.collection.LLRBNode<K,V>`"
  (^com.google.cloud.firestore.collection.LLRBNode [^LLRBEmptyNode this]
    (-> this (.getMax))))

(defn get-key
  "returns: `K`"
  ([^LLRBEmptyNode this]
    (-> this (.getKey))))

(defn get-value
  "returns: `V`"
  ([^LLRBEmptyNode this]
    (-> this (.getValue))))

(defn get-right
  "returns: `com.google.cloud.firestore.collection.LLRBNode<K,V>`"
  (^com.google.cloud.firestore.collection.LLRBNode [^LLRBEmptyNode this]
    (-> this (.getRight))))

(defn remove
  "key - `K`
  comparator - `java.util.Comparator`

  returns: `com.google.cloud.firestore.collection.LLRBNode<K,V>`"
  (^com.google.cloud.firestore.collection.LLRBNode [^LLRBEmptyNode this key ^java.util.Comparator comparator]
    (-> this (.remove key comparator))))

(defn short-circuiting-reverse-order-traversal
  "visitor - `com.google.cloud.firestore.collection.LLRBNode$ShortCircuitingNodeVisitor`

  returns: `boolean`"
  (^Boolean [^LLRBEmptyNode this ^com.google.cloud.firestore.collection.LLRBNode$ShortCircuitingNodeVisitor visitor]
    (-> this (.shortCircuitingReverseOrderTraversal visitor))))

(defn short-circuiting-in-order-traversal
  "visitor - `com.google.cloud.firestore.collection.LLRBNode$ShortCircuitingNodeVisitor`

  returns: `boolean`"
  (^Boolean [^LLRBEmptyNode this ^com.google.cloud.firestore.collection.LLRBNode$ShortCircuitingNodeVisitor visitor]
    (-> this (.shortCircuitingInOrderTraversal visitor))))

(defn insert
  "key - `K`
  value - `V`
  comparator - `java.util.Comparator`

  returns: `com.google.cloud.firestore.collection.LLRBNode<K,V>`"
  (^com.google.cloud.firestore.collection.LLRBNode [^LLRBEmptyNode this key value ^java.util.Comparator comparator]
    (-> this (.insert key value comparator))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^LLRBEmptyNode this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^LLRBEmptyNode this]
    (-> this (.size))))

(defn in-order-traversal
  "visitor - `com.google.cloud.firestore.collection.LLRBNode$NodeVisitor`"
  ([^LLRBEmptyNode this ^com.google.cloud.firestore.collection.LLRBNode$NodeVisitor visitor]
    (-> this (.inOrderTraversal visitor))))

