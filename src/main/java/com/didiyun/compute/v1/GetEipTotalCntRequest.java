// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/eip.proto

package com.didiyun.compute.v1;

/**
 * Protobuf type {@code didi.cloud.compute.v1.GetEipTotalCntRequest}
 */
public  final class GetEipTotalCntRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.compute.v1.GetEipTotalCntRequest)
    GetEipTotalCntRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetEipTotalCntRequest.newBuilder() to construct.
  private GetEipTotalCntRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetEipTotalCntRequest() {
    eip_ = "";
    eipUuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetEipTotalCntRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.didiyun.base.v1.Header.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(com.didiyun.base.v1.Header.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            eip_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              eipUuids_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            eipUuids_.add(s);
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        eipUuids_ = eipUuids_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.didiyun.compute.v1.EipOuterClass.internal_static_didi_cloud_compute_v1_GetEipTotalCntRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.compute.v1.EipOuterClass.internal_static_didi_cloud_compute_v1_GetEipTotalCntRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.compute.v1.GetEipTotalCntRequest.class, com.didiyun.compute.v1.GetEipTotalCntRequest.Builder.class);
  }

  private int bitField0_;
  public static final int HEADER_FIELD_NUMBER = 1;
  private com.didiyun.base.v1.Header header_;
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  public com.didiyun.base.v1.Header getHeader() {
    return header_ == null ? com.didiyun.base.v1.Header.getDefaultInstance() : header_;
  }
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  public com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int EIP_FIELD_NUMBER = 2;
  private volatile java.lang.Object eip_;
  /**
   * <pre>
   *精确匹配EIP
   * </pre>
   *
   * <code>string eip = 2;</code>
   */
  public java.lang.String getEip() {
    java.lang.Object ref = eip_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eip_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *精确匹配EIP
   * </pre>
   *
   * <code>string eip = 2;</code>
   */
  public com.google.protobuf.ByteString
      getEipBytes() {
    java.lang.Object ref = eip_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eip_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EIPUUIDS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList eipUuids_;
  /**
   * <pre>
   *查询指定EIP的信息,UUID
   * </pre>
   *
   * <code>repeated string eipUuids = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getEipUuidsList() {
    return eipUuids_;
  }
  /**
   * <pre>
   *查询指定EIP的信息,UUID
   * </pre>
   *
   * <code>repeated string eipUuids = 3;</code>
   */
  public int getEipUuidsCount() {
    return eipUuids_.size();
  }
  /**
   * <pre>
   *查询指定EIP的信息,UUID
   * </pre>
   *
   * <code>repeated string eipUuids = 3;</code>
   */
  public java.lang.String getEipUuids(int index) {
    return eipUuids_.get(index);
  }
  /**
   * <pre>
   *查询指定EIP的信息,UUID
   * </pre>
   *
   * <code>repeated string eipUuids = 3;</code>
   */
  public com.google.protobuf.ByteString
      getEipUuidsBytes(int index) {
    return eipUuids_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    if (!getEipBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, eip_);
    }
    for (int i = 0; i < eipUuids_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, eipUuids_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    if (!getEipBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, eip_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < eipUuids_.size(); i++) {
        dataSize += computeStringSizeNoTag(eipUuids_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEipUuidsList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.didiyun.compute.v1.GetEipTotalCntRequest)) {
      return super.equals(obj);
    }
    com.didiyun.compute.v1.GetEipTotalCntRequest other = (com.didiyun.compute.v1.GetEipTotalCntRequest) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    result = result && getEip()
        .equals(other.getEip());
    result = result && getEipUuidsList()
        .equals(other.getEipUuidsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    hash = (37 * hash) + EIP_FIELD_NUMBER;
    hash = (53 * hash) + getEip().hashCode();
    if (getEipUuidsCount() > 0) {
      hash = (37 * hash) + EIPUUIDS_FIELD_NUMBER;
      hash = (53 * hash) + getEipUuidsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.compute.v1.GetEipTotalCntRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.GetEipTotalCntRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetEipTotalCntRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.GetEipTotalCntRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetEipTotalCntRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.GetEipTotalCntRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetEipTotalCntRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.GetEipTotalCntRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetEipTotalCntRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.GetEipTotalCntRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetEipTotalCntRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.GetEipTotalCntRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.didiyun.compute.v1.GetEipTotalCntRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code didi.cloud.compute.v1.GetEipTotalCntRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.compute.v1.GetEipTotalCntRequest)
      com.didiyun.compute.v1.GetEipTotalCntRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.compute.v1.EipOuterClass.internal_static_didi_cloud_compute_v1_GetEipTotalCntRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.compute.v1.EipOuterClass.internal_static_didi_cloud_compute_v1_GetEipTotalCntRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.compute.v1.GetEipTotalCntRequest.class, com.didiyun.compute.v1.GetEipTotalCntRequest.Builder.class);
    }

    // Construct using com.didiyun.compute.v1.GetEipTotalCntRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      eip_ = "";

      eipUuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.compute.v1.EipOuterClass.internal_static_didi_cloud_compute_v1_GetEipTotalCntRequest_descriptor;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.GetEipTotalCntRequest getDefaultInstanceForType() {
      return com.didiyun.compute.v1.GetEipTotalCntRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.compute.v1.GetEipTotalCntRequest build() {
      com.didiyun.compute.v1.GetEipTotalCntRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.GetEipTotalCntRequest buildPartial() {
      com.didiyun.compute.v1.GetEipTotalCntRequest result = new com.didiyun.compute.v1.GetEipTotalCntRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      result.eip_ = eip_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        eipUuids_ = eipUuids_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.eipUuids_ = eipUuids_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.didiyun.compute.v1.GetEipTotalCntRequest) {
        return mergeFrom((com.didiyun.compute.v1.GetEipTotalCntRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.compute.v1.GetEipTotalCntRequest other) {
      if (other == com.didiyun.compute.v1.GetEipTotalCntRequest.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (!other.getEip().isEmpty()) {
        eip_ = other.eip_;
        onChanged();
      }
      if (!other.eipUuids_.isEmpty()) {
        if (eipUuids_.isEmpty()) {
          eipUuids_ = other.eipUuids_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureEipUuidsIsMutable();
          eipUuids_.addAll(other.eipUuids_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.didiyun.compute.v1.GetEipTotalCntRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.compute.v1.GetEipTotalCntRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.didiyun.base.v1.Header header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder> headerBuilder_;
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.Header getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? com.didiyun.base.v1.Header.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder setHeader(com.didiyun.base.v1.Header value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder setHeader(
        com.didiyun.base.v1.Header.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder mergeHeader(com.didiyun.base.v1.Header value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            com.didiyun.base.v1.Header.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.Header.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            com.didiyun.base.v1.Header.getDefaultInstance() : header_;
      }
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private java.lang.Object eip_ = "";
    /**
     * <pre>
     *精确匹配EIP
     * </pre>
     *
     * <code>string eip = 2;</code>
     */
    public java.lang.String getEip() {
      java.lang.Object ref = eip_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eip_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *精确匹配EIP
     * </pre>
     *
     * <code>string eip = 2;</code>
     */
    public com.google.protobuf.ByteString
        getEipBytes() {
      java.lang.Object ref = eip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *精确匹配EIP
     * </pre>
     *
     * <code>string eip = 2;</code>
     */
    public Builder setEip(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      eip_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *精确匹配EIP
     * </pre>
     *
     * <code>string eip = 2;</code>
     */
    public Builder clearEip() {
      
      eip_ = getDefaultInstance().getEip();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *精确匹配EIP
     * </pre>
     *
     * <code>string eip = 2;</code>
     */
    public Builder setEipBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      eip_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList eipUuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureEipUuidsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        eipUuids_ = new com.google.protobuf.LazyStringArrayList(eipUuids_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     *查询指定EIP的信息,UUID
     * </pre>
     *
     * <code>repeated string eipUuids = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getEipUuidsList() {
      return eipUuids_.getUnmodifiableView();
    }
    /**
     * <pre>
     *查询指定EIP的信息,UUID
     * </pre>
     *
     * <code>repeated string eipUuids = 3;</code>
     */
    public int getEipUuidsCount() {
      return eipUuids_.size();
    }
    /**
     * <pre>
     *查询指定EIP的信息,UUID
     * </pre>
     *
     * <code>repeated string eipUuids = 3;</code>
     */
    public java.lang.String getEipUuids(int index) {
      return eipUuids_.get(index);
    }
    /**
     * <pre>
     *查询指定EIP的信息,UUID
     * </pre>
     *
     * <code>repeated string eipUuids = 3;</code>
     */
    public com.google.protobuf.ByteString
        getEipUuidsBytes(int index) {
      return eipUuids_.getByteString(index);
    }
    /**
     * <pre>
     *查询指定EIP的信息,UUID
     * </pre>
     *
     * <code>repeated string eipUuids = 3;</code>
     */
    public Builder setEipUuids(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEipUuidsIsMutable();
      eipUuids_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查询指定EIP的信息,UUID
     * </pre>
     *
     * <code>repeated string eipUuids = 3;</code>
     */
    public Builder addEipUuids(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEipUuidsIsMutable();
      eipUuids_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查询指定EIP的信息,UUID
     * </pre>
     *
     * <code>repeated string eipUuids = 3;</code>
     */
    public Builder addAllEipUuids(
        java.lang.Iterable<java.lang.String> values) {
      ensureEipUuidsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, eipUuids_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查询指定EIP的信息,UUID
     * </pre>
     *
     * <code>repeated string eipUuids = 3;</code>
     */
    public Builder clearEipUuids() {
      eipUuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查询指定EIP的信息,UUID
     * </pre>
     *
     * <code>repeated string eipUuids = 3;</code>
     */
    public Builder addEipUuidsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureEipUuidsIsMutable();
      eipUuids_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:didi.cloud.compute.v1.GetEipTotalCntRequest)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.compute.v1.GetEipTotalCntRequest)
  private static final com.didiyun.compute.v1.GetEipTotalCntRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.compute.v1.GetEipTotalCntRequest();
  }

  public static com.didiyun.compute.v1.GetEipTotalCntRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetEipTotalCntRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetEipTotalCntRequest>() {
    @java.lang.Override
    public GetEipTotalCntRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetEipTotalCntRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetEipTotalCntRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetEipTotalCntRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.compute.v1.GetEipTotalCntRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

