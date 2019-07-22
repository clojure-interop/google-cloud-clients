(ns com.google.cloud.logging.Operation$Builder
  "A builder for Operation objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging Operation$Builder]))

(defn set-id
  "Sets the operation identifier. Log entries with the same identifier are assumed to be part of
   the same operation. The combination of id and producer must be globally unique.

  id - `java.lang.String`

  returns: `com.google.cloud.logging.Operation$Builder`"
  (^com.google.cloud.logging.Operation$Builder [^Operation$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn set-producer
  "Sets an arbitrary producer identifier. The combination of producer and id must be globally
   unique. Examples: MyDivision.MyBigCompany.com, github.com/MyProject/MyApplication.

  producer - `java.lang.String`

  returns: `com.google.cloud.logging.Operation$Builder`"
  (^com.google.cloud.logging.Operation$Builder [^Operation$Builder this ^java.lang.String producer]
    (-> this (.setProducer producer))))

(defn set-first
  "Sets whether the corresponding entry is the first log entry in the operation. If not set,
   false is used.

  first - `boolean`

  returns: `com.google.cloud.logging.Operation$Builder`"
  (^com.google.cloud.logging.Operation$Builder [^Operation$Builder this ^Boolean first]
    (-> this (.setFirst first))))

(defn set-last
  "Sets whether the corresponding entry is the last log entry in the operation. If not set,
   false is used.

  last - `boolean`

  returns: `com.google.cloud.logging.Operation$Builder`"
  (^com.google.cloud.logging.Operation$Builder [^Operation$Builder this ^Boolean last]
    (-> this (.setLast last))))

(defn build
  "Creates an Operation object for this builder.

  returns: `com.google.cloud.logging.Operation`"
  (^com.google.cloud.logging.Operation [^Operation$Builder this]
    (-> this (.build))))

