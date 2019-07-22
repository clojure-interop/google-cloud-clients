(ns com.google.cloud.compute.v1.AddressesScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AddressesScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AddressesScopedList`

  returns: `com.google.cloud.compute.v1.AddressesScopedList$Builder`"
  (^com.google.cloud.compute.v1.AddressesScopedList$Builder [^com.google.cloud.compute.v1.AddressesScopedList prototype]
    (AddressesScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.AddressesScopedList$Builder []
    (AddressesScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AddressesScopedList`"
  (^com.google.cloud.compute.v1.AddressesScopedList []
    (AddressesScopedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning which replaces the list of addresses when the list is
   empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^AddressesScopedList this]
    (-> this (.getWarning))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AddressesScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AddressesScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AddressesScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AddressesScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AddressesScopedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AddressesScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-addresses-list
  "[Output Only] A list of addresses contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.Address>`"
  (^java.util.List [^AddressesScopedList this]
    (-> this (.getAddressesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AddressesScopedList$Builder`"
  (^com.google.cloud.compute.v1.AddressesScopedList$Builder [^AddressesScopedList this]
    (-> this (.toBuilder))))

