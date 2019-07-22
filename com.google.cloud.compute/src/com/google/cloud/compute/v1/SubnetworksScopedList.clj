(ns com.google.cloud.compute.v1.SubnetworksScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SubnetworksScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SubnetworksScopedList`

  returns: `com.google.cloud.compute.v1.SubnetworksScopedList$Builder`"
  (^com.google.cloud.compute.v1.SubnetworksScopedList$Builder [^com.google.cloud.compute.v1.SubnetworksScopedList prototype]
    (SubnetworksScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.SubnetworksScopedList$Builder []
    (SubnetworksScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SubnetworksScopedList`"
  (^com.google.cloud.compute.v1.SubnetworksScopedList []
    (SubnetworksScopedList/getDefaultInstance )))

(defn get-warning
  "An informational warning that appears when the list of addresses is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^SubnetworksScopedList this]
    (-> this (.getWarning))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SubnetworksScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SubnetworksScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SubnetworksScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-subnetworks-list
  "A list of subnetworks contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.Subnetwork>`"
  (^java.util.List [^SubnetworksScopedList this]
    (-> this (.getSubnetworksList))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SubnetworksScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SubnetworksScopedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SubnetworksScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SubnetworksScopedList$Builder`"
  (^com.google.cloud.compute.v1.SubnetworksScopedList$Builder [^SubnetworksScopedList this]
    (-> this (.toBuilder))))

