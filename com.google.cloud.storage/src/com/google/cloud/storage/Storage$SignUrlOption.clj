(ns com.google.cloud.storage.Storage$SignUrlOption
  "Class for specifying signed URL options."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.storage Storage$SignUrlOption]))

(defn *http-method
  "The HTTP method to be used with the signed URL. If this method is not called, defaults to
   GET.

  http-method - `com.google.cloud.storage.HttpMethod`

  returns: `com.google.cloud.storage.Storage$SignUrlOption`"
  (^com.google.cloud.storage.Storage$SignUrlOption [^com.google.cloud.storage.HttpMethod http-method]
    (Storage$SignUrlOption/httpMethod http-method)))

(defn *with-content-type
  "Use it if signature should include the blob's content-type. When used, users of the signed
   URL should include the blob's content-type with their request. If using this URL from a
   browser, you must include a content type that matches what the browser will send.

  returns: `com.google.cloud.storage.Storage$SignUrlOption`"
  (^com.google.cloud.storage.Storage$SignUrlOption []
    (Storage$SignUrlOption/withContentType )))

(defn *with-md-5
  "Use it if signature should include the blob's md5. When used, users of the signed URL should
   include the blob's md5 with their request.

  returns: `com.google.cloud.storage.Storage$SignUrlOption`"
  (^com.google.cloud.storage.Storage$SignUrlOption []
    (Storage$SignUrlOption/withMd5 )))

(defn *with-ext-headers
  "Use it if signature should include the blob's canonicalized extended headers. When used,
   users of the signed URL should include the canonicalized extended headers with their request.

  ext-headers - `java.util.Map`

  returns: `com.google.cloud.storage.Storage$SignUrlOption`"
  (^com.google.cloud.storage.Storage$SignUrlOption [^java.util.Map ext-headers]
    (Storage$SignUrlOption/withExtHeaders ext-headers)))

(defn *with-v-2-signature
  "Use if signature version should be V2. This is the default if neither this or withV4Signature() is called.

  returns: `com.google.cloud.storage.Storage$SignUrlOption`"
  (^com.google.cloud.storage.Storage$SignUrlOption []
    (Storage$SignUrlOption/withV2Signature )))

(defn *with-v-4-signature
  "Use if signature version should be V4. Note that V4 Signed URLs can't have an expiration
   longer than 7 days. V2 will be the default if neither this or withV2Signature() is
   called.

  returns: `com.google.cloud.storage.Storage$SignUrlOption`"
  (^com.google.cloud.storage.Storage$SignUrlOption []
    (Storage$SignUrlOption/withV4Signature )))

(defn *sign-with
  "Provides a service account signer to sign the URL. If not provided an attempt will be made to
   get it from the environment.

  signer - `com.google.auth.ServiceAccountSigner`

  returns: `com.google.cloud.storage.Storage$SignUrlOption`"
  (^com.google.cloud.storage.Storage$SignUrlOption [^com.google.auth.ServiceAccountSigner signer]
    (Storage$SignUrlOption/signWith signer)))

(defn *with-host-name
  "Use a different host name than the default host name 'storage.googleapis.com'

  host-name - `java.lang.String`

  returns: `com.google.cloud.storage.Storage$SignUrlOption`"
  (^com.google.cloud.storage.Storage$SignUrlOption [^java.lang.String host-name]
    (Storage$SignUrlOption/withHostName host-name)))

