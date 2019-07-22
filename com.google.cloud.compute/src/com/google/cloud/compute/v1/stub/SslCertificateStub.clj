(ns com.google.cloud.compute.v1.stub.SslCertificateStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub SslCertificateStub]))

(defn ->ssl-certificate-stub
  "Constructor."
  (^SslCertificateStub []
    (new SslCertificateStub )))

(defn delete-ssl-certificate-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSslCertificateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslCertificateStub this]
    (-> this (.deleteSslCertificateCallable))))

(defn get-ssl-certificate-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetSslCertificateHttpRequest,com.google.cloud.compute.v1.SslCertificate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslCertificateStub this]
    (-> this (.getSslCertificateCallable))))

(defn insert-ssl-certificate-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertSslCertificateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslCertificateStub this]
    (-> this (.insertSslCertificateCallable))))

(defn list-ssl-certificates-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSslCertificatesHttpRequest,com.google.cloud.compute.v1.SslCertificateClient$ListSslCertificatesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslCertificateStub this]
    (-> this (.listSslCertificatesPagedCallable))))

(defn list-ssl-certificates-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSslCertificatesHttpRequest,com.google.cloud.compute.v1.SslCertificateList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SslCertificateStub this]
    (-> this (.listSslCertificatesCallable))))

(defn close
  ""
  ([^SslCertificateStub this]
    (-> this (.close))))

