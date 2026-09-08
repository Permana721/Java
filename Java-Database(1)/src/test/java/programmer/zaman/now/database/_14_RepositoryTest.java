package programmer.zaman.now.database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programmer.zaman.now.database.entity.Comment;
import programmer.zaman.now.database.repository.CommentRepository;
import programmer.zaman.now.database.repository.CommentRepositoryImpl;

import java.util.List;

/*
Dalam buku Domain-Driven Design, Eric Evans menjelaskan bahwa
“repository is a mechanism for encapsulating storage, retrieval, and search behavior,
which emulates a collection of objects”
Pattern Repository ini biasanya digunakan sebagai jembatan antar business logic aplikasi kita
dengan semua perintah SQL ke database
Jadi semua perintah SQL akan ditulis di Repository, sedangkan business logic kode program kita hanya cukup
menggunakan Repository tersebut
 */

public class _14_RepositoryTest {
    private CommentRepository commentRepository;

    @BeforeEach
    void setUp() {
        commentRepository = new CommentRepositoryImpl();
    }

    @Test
    void testInsert() {
        Comment comment = new Comment("mana@mail.com", "hi");
        commentRepository.insert(comment);

        Assertions.assertNotNull(comment.getId());
        System.out.println(comment.getId());
    }

    @Test
    void testFindById() {
        Comment comment = commentRepository.findById(101);
        Assertions.assertNotNull(comment);
        System.out.println(comment.getId());
        System.out.println(comment.getEmail());
        System.out.println(comment.getComment());

        Comment notFound = commentRepository.findById(122);
        Assertions.assertNull(notFound);
    }

    @Test
    void testFindAll() {
        List<Comment> comments = commentRepository.findAll();
        System.out.println(comments.size());
    }

    @Test
    void testFindByEmail() {
        List<Comment> comments = commentRepository.findAllByEmail("mana@mail.com");
        System.out.println(comments.size());
    }
}
