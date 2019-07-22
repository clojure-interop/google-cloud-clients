(ns com.google.cloud.compute.v1.Reference
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Reference]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Reference`

  returns: `com.google.cloud.compute.v1.Reference$Builder`"
  (^com.google.cloud.compute.v1.Reference$Builder [^com.google.cloud.compute.v1.Reference prototype]
    (Reference/newBuilder prototype))
  (^com.google.cloud.compute.v1.Reference$Builder []
    (Reference/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Reference`"
  (^com.google.cloud.compute.v1.Reference []
    (Reference/getDefaultInstance )))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#reference for references.

  returns: `java.lang.String`"
  (^java.lang.String [^Reference this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Reference this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Reference this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Reference this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Reference this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Reference this]
    (-> this (.hashCode))))

(defn get-target
  "URL of the resource to which this reference points.

  returns: `java.lang.String`"
  (^java.lang.String [^Reference this]
    (-> this (.getTarget))))

(defn get-referrer
  "URL of the resource which refers to the target.

  returns: `java.lang.String`"
  (^java.lang.String [^Reference this]
    (-> this (.getReferrer))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Reference this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-reference-type
  "A description of the reference type with no implied semantics. Possible values include: -
   MEMBER_OF

  returns: `java.lang.String`"
  (^java.lang.String [^Reference this]
    (-> this (.getReferenceType))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Reference$Builder`"
  (^com.google.cloud.compute.v1.Reference$Builder [^Reference this]
    (-> this (.toBuilder))))

