(ns com.google.cloud.storage.SignatureInfo
  "Signature Info holds payload components of the string that requires signing."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage SignatureInfo]))

(def *-component-separator
  "Static Constant.

  type: char"
  SignatureInfo/COMPONENT_SEPARATOR)

(def *-goog-4-rsa-sha-256
  "Static Constant.

  type: java.lang.String"
  SignatureInfo/GOOG4_RSA_SHA256)

(def *-scope
  "Static Constant.

  type: java.lang.String"
  SignatureInfo/SCOPE)

(defn get-signature-version
  "returns: `com.google.cloud.storage.Storage.SignUrlOption.SignatureVersion`"
  (^com.google.cloud.storage.Storage.SignUrlOption.SignatureVersion [^SignatureInfo this]
    (-> this (.getSignatureVersion))))

(defn get-canonicalized-extension-headers
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^SignatureInfo this]
    (-> this (.getCanonicalizedExtensionHeaders))))

(defn get-timestamp
  "returns: `long`"
  (^Long [^SignatureInfo this]
    (-> this (.getTimestamp))))

(defn get-content-type
  "returns: `java.lang.String`"
  (^java.lang.String [^SignatureInfo this]
    (-> this (.getContentType))))

(defn get-content-md-5
  "returns: `java.lang.String`"
  (^java.lang.String [^SignatureInfo this]
    (-> this (.getContentMd5))))

(defn construct-unsigned-payload
  "Constructs payload to be signed.

  returns: payload to sign - `java.lang.String`"
  (^java.lang.String [^SignatureInfo this]
    (-> this (.constructUnsignedPayload))))

(defn get-account-email
  "returns: `java.lang.String`"
  (^java.lang.String [^SignatureInfo this]
    (-> this (.getAccountEmail))))

(defn get-canonicalized-resource
  "returns: `java.net.URI`"
  (^java.net.URI [^SignatureInfo this]
    (-> this (.getCanonicalizedResource))))

(defn get-expiration
  "returns: `long`"
  (^Long [^SignatureInfo this]
    (-> this (.getExpiration))))

(defn construct-v-4-query-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SignatureInfo this]
    (-> this (.constructV4QueryString))))

(defn get-http-verb
  "returns: `com.google.cloud.storage.HttpMethod`"
  (^com.google.cloud.storage.HttpMethod [^SignatureInfo this]
    (-> this (.getHttpVerb))))

