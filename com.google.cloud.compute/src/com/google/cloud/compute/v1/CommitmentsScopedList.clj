(ns com.google.cloud.compute.v1.CommitmentsScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 CommitmentsScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.CommitmentsScopedList`

  returns: `com.google.cloud.compute.v1.CommitmentsScopedList$Builder`"
  (^com.google.cloud.compute.v1.CommitmentsScopedList$Builder [^com.google.cloud.compute.v1.CommitmentsScopedList prototype]
    (CommitmentsScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.CommitmentsScopedList$Builder []
    (CommitmentsScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.CommitmentsScopedList`"
  (^com.google.cloud.compute.v1.CommitmentsScopedList []
    (CommitmentsScopedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning which replaces the list of commitments when the list is
   empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^CommitmentsScopedList this]
    (-> this (.getWarning))))

(defn get-commitments-list
  "[Output Only] A list of commitments contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.Commitment>`"
  (^java.util.List [^CommitmentsScopedList this]
    (-> this (.getCommitmentsList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CommitmentsScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^CommitmentsScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^CommitmentsScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^CommitmentsScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CommitmentsScopedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CommitmentsScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.CommitmentsScopedList$Builder`"
  (^com.google.cloud.compute.v1.CommitmentsScopedList$Builder [^CommitmentsScopedList this]
    (-> this (.toBuilder))))

