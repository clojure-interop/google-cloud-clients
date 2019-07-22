(ns com.google.cloud.storage.CanonicalExtensionHeadersSerializer
  "Canonical extension header serializer."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage CanonicalExtensionHeadersSerializer]))

(defn ->canonical-extension-headers-serializer
  "Constructor.

  signature-version - `com.google.cloud.storage.Storage.SignUrlOption.SignatureVersion`"
  (^CanonicalExtensionHeadersSerializer [^com.google.cloud.storage.Storage.SignUrlOption.SignatureVersion signature-version]
    (new CanonicalExtensionHeadersSerializer signature-version))
  (^CanonicalExtensionHeadersSerializer []
    (new CanonicalExtensionHeadersSerializer )))

(defn serialize
  "canonicalized-extension-headers - `java.util.Map`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^CanonicalExtensionHeadersSerializer this ^java.util.Map canonicalized-extension-headers]
    (-> this (.serialize canonicalized-extension-headers))))

(defn serialize-header-names
  "canonicalized-extension-headers - `java.util.Map`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^CanonicalExtensionHeadersSerializer this ^java.util.Map canonicalized-extension-headers]
    (-> this (.serializeHeaderNames canonicalized-extension-headers))))

