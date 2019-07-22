(ns com.google.cloud.compute.v1.InterconnectAttachmentsScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectAttachmentsScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InterconnectAttachmentsScopedList`

  returns: `com.google.cloud.compute.v1.InterconnectAttachmentsScopedList$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentsScopedList$Builder [^com.google.cloud.compute.v1.InterconnectAttachmentsScopedList prototype]
    (InterconnectAttachmentsScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.InterconnectAttachmentsScopedList$Builder []
    (InterconnectAttachmentsScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InterconnectAttachmentsScopedList`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentsScopedList []
    (InterconnectAttachmentsScopedList/getDefaultInstance )))

(defn get-warning
  "Informational warning which replaces the list of addresses when the list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^InterconnectAttachmentsScopedList this]
    (-> this (.getWarning))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InterconnectAttachmentsScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InterconnectAttachmentsScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InterconnectAttachmentsScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InterconnectAttachmentsScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InterconnectAttachmentsScopedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InterconnectAttachmentsScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InterconnectAttachmentsScopedList$Builder`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentsScopedList$Builder [^InterconnectAttachmentsScopedList this]
    (-> this (.toBuilder))))

(defn get-interconnect-attachments-list
  "A list of interconnect attachments contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.InterconnectAttachment>`"
  (^java.util.List [^InterconnectAttachmentsScopedList this]
    (-> this (.getInterconnectAttachmentsList))))

