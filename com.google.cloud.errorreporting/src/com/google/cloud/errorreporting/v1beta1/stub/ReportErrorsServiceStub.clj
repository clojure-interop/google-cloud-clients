(ns com.google.cloud.errorreporting.v1beta1.stub.ReportErrorsServiceStub
  "Base stub class for Stackdriver Error Reporting API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1.stub ReportErrorsServiceStub]))

(defn ->report-errors-service-stub
  "Constructor."
  (^ReportErrorsServiceStub []
    (new ReportErrorsServiceStub )))

(defn report-error-event-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest,com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ReportErrorsServiceStub this]
    (-> this (.reportErrorEventCallable))))

(defn close
  ""
  ([^ReportErrorsServiceStub this]
    (-> this (.close))))

