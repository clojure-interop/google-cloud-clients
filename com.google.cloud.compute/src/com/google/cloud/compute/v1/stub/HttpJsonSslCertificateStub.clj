(ns com.google.cloud.compute.v1.stub.HttpJsonSslCertificateStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonSslCertificateStub]))

(def *-delete-ssl-certificate-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteSslCertificateHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonSslCertificateStub/deleteSslCertificateMethodDescriptor)

(def *-get-ssl-certificate-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetSslCertificateHttpRequest,com.google.cloud.compute.v1.SslCertificate>"
  HttpJsonSslCertificateStub/getSslCertificateMethodDescriptor)

(def *-insert-ssl-certificate-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertSslCertificateHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonSslCertificateStub/insertSslCertificateMethodDescriptor)

(def *-list-ssl-certificates-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListSslCertificatesHttpRequest,com.google.cloud.compute.v1.SslCertificateList>"
  HttpJsonSslCertificateStub/listSslCertificatesMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonSslCertificateStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonSslCertificateStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonSslCertificateStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonSslCertificateStub [^com.google.cloud.compute.v1.stub.SslCertificateStubSettings settings]
    (HttpJsonSslCertificateStub/create settings)))

(defn insert-ssl-certificate-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertSslCertificateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSslCertificateStub this]
    (-> this (.insertSslCertificateCallable))))

(defn get-ssl-certificate-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetSslCertificateHttpRequest,com.google.cloud.compute.v1.SslCertificate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSslCertificateStub this]
    (-> this (.getSslCertificateCallable))))

(defn list-ssl-certificates-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSslCertificatesHttpRequest,com.google.cloud.compute.v1.SslCertificateClient$ListSslCertificatesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSslCertificateStub this]
    (-> this (.listSslCertificatesPagedCallable))))

(defn list-ssl-certificates-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSslCertificatesHttpRequest,com.google.cloud.compute.v1.SslCertificateList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSslCertificateStub this]
    (-> this (.listSslCertificatesCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonSslCertificateStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonSslCertificateStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonSslCertificateStub this]
    (-> this (.shutdown))))

(defn delete-ssl-certificate-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSslCertificateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSslCertificateStub this]
    (-> this (.deleteSslCertificateCallable))))

(defn close
  ""
  ([^HttpJsonSslCertificateStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonSslCertificateStub this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^HttpJsonSslCertificateStub this]
    (-> this (.shutdownNow))))

