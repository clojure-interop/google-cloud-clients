(ns com.google.cloud.logging.Operation
  "Additional information about a potentially long-running operation with which a log entry is
  associated."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging Operation]))

(defn *new-builder
  "Returns a builder for Operation objects given the operation and producer identifiers.
   The combination of producer and id must be globally unique.

  id - `java.lang.String`
  producer - `java.lang.String`

  returns: `com.google.cloud.logging.Operation$Builder`"
  (^com.google.cloud.logging.Operation$Builder [^java.lang.String id ^java.lang.String producer]
    (Operation/newBuilder id producer)))

(defn *of
  "Returns a Operation object given the operation and producer identifiers. The
   combination of producer and id must be globally unique.

  id - `java.lang.String`
  producer - `java.lang.String`

  returns: `com.google.cloud.logging.Operation`"
  (^com.google.cloud.logging.Operation [^java.lang.String id ^java.lang.String producer]
    (Operation/of id producer)))

(defn get-id
  "Returns the operation identifier. Log entries with the same identifier are assumed to be part
   of the same operation. The combination of this value and getProducer() must be
   globally unique.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getId))))

(defn get-producer
  "Returns an arbitrary producer identifier. The combination of this value and getId()
   must be globally unique. Examples: MyDivision.MyBigCompany.com, github.com/MyProject/MyApplication.

  returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.getProducer))))

(defn first
  "Returns true if the corresponding entry is the first log entry in the operation, false otherwise.

  returns: `boolean`"
  (^Boolean [^Operation this]
    (-> this (.first))))

(defn last
  "Returns true if the corresponding entry is the last log entry in the operation, false otherwise.

  returns: `boolean`"
  (^Boolean [^Operation this]
    (-> this (.last))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Operation this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Operation this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Operation this]
    (-> this (.toString))))

(defn to-builder
  "Returns a Builder for this operation.

  returns: `com.google.cloud.logging.Operation$Builder`"
  (^com.google.cloud.logging.Operation$Builder [^Operation this]
    (-> this (.toBuilder))))

