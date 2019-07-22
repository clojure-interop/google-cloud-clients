(ns com.google.cloud.storage.SignatureInfo$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage SignatureInfo$Builder]))

(defn ->builder
  "Constructor.

  Constructs builder.

  http-verb - the HTTP method - `com.google.cloud.storage.HttpMethod`
  expiration - the EPOX expiration date - `long`
  canonicalized-resource - the resource URI - `java.net.URI`

  throws: java.lang.IllegalArgumentException - if required field is not provided."
  (^SignatureInfo$Builder [^com.google.cloud.storage.HttpMethod http-verb ^Long expiration ^java.net.URI canonicalized-resource]
    (new SignatureInfo$Builder http-verb expiration canonicalized-resource))
  (^SignatureInfo$Builder [^com.google.cloud.storage.SignatureInfo signature-info]
    (new SignatureInfo$Builder signature-info)))

(defn set-content-md-5
  "content-md-5 - `java.lang.String`

  returns: `com.google.cloud.storage.SignatureInfo$Builder`"
  (^com.google.cloud.storage.SignatureInfo$Builder [^SignatureInfo$Builder this ^java.lang.String content-md-5]
    (-> this (.setContentMd5 content-md-5))))

(defn set-content-type
  "content-type - `java.lang.String`

  returns: `com.google.cloud.storage.SignatureInfo$Builder`"
  (^com.google.cloud.storage.SignatureInfo$Builder [^SignatureInfo$Builder this ^java.lang.String content-type]
    (-> this (.setContentType content-type))))

(defn set-canonicalized-extension-headers
  "canonicalized-extension-headers - `java.util.Map`

  returns: `com.google.cloud.storage.SignatureInfo$Builder`"
  (^com.google.cloud.storage.SignatureInfo$Builder [^SignatureInfo$Builder this ^java.util.Map canonicalized-extension-headers]
    (-> this (.setCanonicalizedExtensionHeaders canonicalized-extension-headers))))

(defn set-signature-version
  "signature-version - `com.google.cloud.storage.Storage.SignUrlOption.SignatureVersion`

  returns: `com.google.cloud.storage.SignatureInfo$Builder`"
  (^com.google.cloud.storage.SignatureInfo$Builder [^SignatureInfo$Builder this ^com.google.cloud.storage.Storage.SignUrlOption.SignatureVersion signature-version]
    (-> this (.setSignatureVersion signature-version))))

(defn set-account-email
  "account-email - `java.lang.String`

  returns: `com.google.cloud.storage.SignatureInfo$Builder`"
  (^com.google.cloud.storage.SignatureInfo$Builder [^SignatureInfo$Builder this ^java.lang.String account-email]
    (-> this (.setAccountEmail account-email))))

(defn set-timestamp
  "timestamp - `long`

  returns: `com.google.cloud.storage.SignatureInfo$Builder`"
  (^com.google.cloud.storage.SignatureInfo$Builder [^SignatureInfo$Builder this ^Long timestamp]
    (-> this (.setTimestamp timestamp))))

(defn build
  "Creates an SignatureInfo object from this builder.

  returns: `com.google.cloud.storage.SignatureInfo`"
  (^com.google.cloud.storage.SignatureInfo [^SignatureInfo$Builder this]
    (-> this (.build))))

