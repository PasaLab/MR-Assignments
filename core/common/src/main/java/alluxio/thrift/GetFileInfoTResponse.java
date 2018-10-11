/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package alluxio.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class GetFileInfoTResponse implements org.apache.thrift.TBase<GetFileInfoTResponse, GetFileInfoTResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetFileInfoTResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetFileInfoTResponse");

  private static final org.apache.thrift.protocol.TField FILE_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("fileInfo", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetFileInfoTResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetFileInfoTResponseTupleSchemeFactory());
  }

  private FileInfo fileInfo; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FILE_INFO((short)1, "fileInfo");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FILE_INFO
          return FILE_INFO;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FILE_INFO, new org.apache.thrift.meta_data.FieldMetaData("fileInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FileInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetFileInfoTResponse.class, metaDataMap);
  }

  public GetFileInfoTResponse() {
  }

  public GetFileInfoTResponse(
    FileInfo fileInfo)
  {
    this();
    this.fileInfo = fileInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetFileInfoTResponse(GetFileInfoTResponse other) {
    if (other.isSetFileInfo()) {
      this.fileInfo = new FileInfo(other.fileInfo);
    }
  }

  public GetFileInfoTResponse deepCopy() {
    return new GetFileInfoTResponse(this);
  }

  @Override
  public void clear() {
    this.fileInfo = null;
  }

  public FileInfo getFileInfo() {
    return this.fileInfo;
  }

  public GetFileInfoTResponse setFileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

  public void unsetFileInfo() {
    this.fileInfo = null;
  }

  /** Returns true if field fileInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetFileInfo() {
    return this.fileInfo != null;
  }

  public void setFileInfoIsSet(boolean value) {
    if (!value) {
      this.fileInfo = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FILE_INFO:
      if (value == null) {
        unsetFileInfo();
      } else {
        setFileInfo((FileInfo)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FILE_INFO:
      return getFileInfo();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FILE_INFO:
      return isSetFileInfo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetFileInfoTResponse)
      return this.equals((GetFileInfoTResponse)that);
    return false;
  }

  public boolean equals(GetFileInfoTResponse that) {
    if (that == null)
      return false;

    boolean this_present_fileInfo = true && this.isSetFileInfo();
    boolean that_present_fileInfo = true && that.isSetFileInfo();
    if (this_present_fileInfo || that_present_fileInfo) {
      if (!(this_present_fileInfo && that_present_fileInfo))
        return false;
      if (!this.fileInfo.equals(that.fileInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_fileInfo = true && (isSetFileInfo());
    list.add(present_fileInfo);
    if (present_fileInfo)
      list.add(fileInfo);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetFileInfoTResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFileInfo()).compareTo(other.isSetFileInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFileInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fileInfo, other.fileInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetFileInfoTResponse(");
    boolean first = true;

    sb.append("fileInfo:");
    if (this.fileInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.fileInfo);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (fileInfo != null) {
      fileInfo.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetFileInfoTResponseStandardSchemeFactory implements SchemeFactory {
    public GetFileInfoTResponseStandardScheme getScheme() {
      return new GetFileInfoTResponseStandardScheme();
    }
  }

  private static class GetFileInfoTResponseStandardScheme extends StandardScheme<GetFileInfoTResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetFileInfoTResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FILE_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.fileInfo = new FileInfo();
              struct.fileInfo.read(iprot);
              struct.setFileInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetFileInfoTResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.fileInfo != null) {
        oprot.writeFieldBegin(FILE_INFO_FIELD_DESC);
        struct.fileInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetFileInfoTResponseTupleSchemeFactory implements SchemeFactory {
    public GetFileInfoTResponseTupleScheme getScheme() {
      return new GetFileInfoTResponseTupleScheme();
    }
  }

  private static class GetFileInfoTResponseTupleScheme extends TupleScheme<GetFileInfoTResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetFileInfoTResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFileInfo()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetFileInfo()) {
        struct.fileInfo.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetFileInfoTResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.fileInfo = new FileInfo();
        struct.fileInfo.read(iprot);
        struct.setFileInfoIsSet(true);
      }
    }
  }

}

