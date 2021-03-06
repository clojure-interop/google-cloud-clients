(ns com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrpcGrafeasV1Beta1Stub
  "gRPC stub implementation for Container Analysis API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.devtools.containeranalysis.v1beta1.stub GrpcGrafeasV1Beta1Stub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrpcGrafeasV1Beta1Stub`

  throws: java.io.IOException"
  (^com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrpcGrafeasV1Beta1Stub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcGrafeasV1Beta1Stub/create client-context callable-factory))
  (^com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrpcGrafeasV1Beta1Stub [^com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrafeasV1Beta1StubSettings settings]
    (GrpcGrafeasV1Beta1Stub/create settings)))

(defn list-notes-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.ListNotesRequest,com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNotesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.listNotesPagedCallable))))

(defn batch-create-notes-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.BatchCreateNotesRequest,io.grafeas.v1beta1.BatchCreateNotesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.batchCreateNotesCallable))))

(defn list-note-occurrences-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.ListNoteOccurrencesRequest,com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListNoteOccurrencesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.listNoteOccurrencesPagedCallable))))

(defn list-occurrences-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.ListOccurrencesRequest,com.google.cloud.devtools.containeranalysis.v1beta1.GrafeasV1Beta1Client$ListOccurrencesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.listOccurrencesPagedCallable))))

(defn create-note-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.CreateNoteRequest,io.grafeas.v1beta1.Note>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.createNoteCallable))))

(defn list-notes-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.ListNotesRequest,io.grafeas.v1beta1.ListNotesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.listNotesCallable))))

(defn list-note-occurrences-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.ListNoteOccurrencesRequest,io.grafeas.v1beta1.ListNoteOccurrencesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.listNoteOccurrencesCallable))))

(defn create-occurrence-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.CreateOccurrenceRequest,io.grafeas.v1beta1.Occurrence>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.createOccurrenceCallable))))

(defn batch-create-occurrences-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.BatchCreateOccurrencesRequest,io.grafeas.v1beta1.BatchCreateOccurrencesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.batchCreateOccurrencesCallable))))

(defn delete-note-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.DeleteNoteRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.deleteNoteCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcGrafeasV1Beta1Stub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcGrafeasV1Beta1Stub this]
    (-> this (.shutdown))))

(defn get-occurrence-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.GetOccurrenceRequest,io.grafeas.v1beta1.Occurrence>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.getOccurrenceCallable))))

(defn list-occurrences-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.ListOccurrencesRequest,io.grafeas.v1beta1.ListOccurrencesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.listOccurrencesCallable))))

(defn update-occurrence-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.UpdateOccurrenceRequest,io.grafeas.v1beta1.Occurrence>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.updateOccurrenceCallable))))

(defn get-note-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.GetNoteRequest,io.grafeas.v1beta1.Note>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.getNoteCallable))))

(defn close
  ""
  ([^GrpcGrafeasV1Beta1Stub this]
    (-> this (.close))))

(defn get-occurrence-note-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.GetOccurrenceNoteRequest,io.grafeas.v1beta1.Note>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.getOccurrenceNoteCallable))))

(defn delete-occurrence-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.DeleteOccurrenceRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.deleteOccurrenceCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.isTerminated))))

(defn get-vulnerability-occurrences-summary-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.GetVulnerabilityOccurrencesSummaryRequest,io.grafeas.v1beta1.VulnerabilityOccurrencesSummary>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.getVulnerabilityOccurrencesSummaryCallable))))

(defn update-note-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<io.grafeas.v1beta1.UpdateNoteRequest,io.grafeas.v1beta1.Note>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGrafeasV1Beta1Stub this]
    (-> this (.updateNoteCallable))))

(defn shutdown-now
  ""
  ([^GrpcGrafeasV1Beta1Stub this]
    (-> this (.shutdownNow))))

