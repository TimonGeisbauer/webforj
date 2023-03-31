package org.dwcj.exceptions;

/**
 * This class is used for reporting DWC annotation level exceptions
 * 
 * @author Hyyan Abo Fakher
 */
public class AnnotationException extends DwcjRuntimeException {

    private static final String DEFAULT_MESSAGE = "Failed to process DWC annotation";

    /**
     * Constructs a new exception with the specified detail message and
     * cause.
     * <p>
     * Note that the detail message associated with
     * {@code cause} is <i>not</i> automatically incorporated in
     * this exception's detail message.
     *
     * @param message the detail message (which is saved for later retrieval
     *                by the {@link #getMessage()} method).
     * @param cause   the cause (which is saved for later retrieval by the
     *                {@link #getCause()} method). (A {@code null} value is
     *                permitted, and indicates that the cause is nonexistent or
     *                unknown.)
     */
    public AnnotationException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new exception with the specified cause and a detail
     * message of {@code (cause==null ? null : cause.toString())} (which
     * typically contains the class and detail message of {@code cause}).
     * This constructor is useful for exceptions that are little more than
     * wrappers for other throwables.
     *
     * @param cause the cause (which is saved for later retrieval by the
     *              {@link #getCause()} method). (A {@code null} value is
     *              permitted, and indicates that the cause is nonexistent or
     *              unknown.)
     */
    public AnnotationException(Throwable e) {
        super(DEFAULT_MESSAGE, e);
    }

    /**
     * Constructs a new exception with the specified detail message. The cause is
     * not initialized, and may subsequently be initialized by a call to
     * {@link #initCause}.
     *
     * @param e the detail message. The detail message is saved for later
     *          retrieval by the {@link #getMessage()} method.
     */
    public AnnotationException(String e) {
        super(e);
    }

    /**
     * Constructs a new exception with the specified detail message.
     */
    public AnnotationException() {
        super(DEFAULT_MESSAGE);
    }
}
